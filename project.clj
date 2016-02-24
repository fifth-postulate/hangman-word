(defproject hangman-word "0.1.0-SNAPSHOT"
  :description "Exploration into a good hangman word"
  :url "https://github.com/fifth-postulate/hangman-word"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :main ^:skip-aot hangman-word.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
