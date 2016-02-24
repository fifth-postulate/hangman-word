(ns hangman-word.core
  (:gen-class))

(defn letters-in-clue
  "returns the set of letters in a clue"
  [clue]
  (let [split-pattern (re-pattern "")
        no-bar (fn [letter] (not (= letter "_")))]
    (set (filter no-bar (clojure.string/split clue split-pattern)))))

(defn regexp-from-clue
  "Takes a clue, e.g. \"_e_l_g\", an alphabet and a set of chosen-letters and
  creates a regular expression that will match words according to that clue"
  [clue alphabet chosen-letters]
  (let [bar-pattern (str "("
                         (clojure.string/join "|" (clojure.set/difference alphabet (clojure.set/union (letters-in-clue clue) chosen-letters)))
                         ")")
        mapper (fn [letter] (if (= letter \_) bar-pattern letter))]
    (re-pattern (clojure.string/join "" (map mapper clue)))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
