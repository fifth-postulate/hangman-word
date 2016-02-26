(ns hangman-word.core-test
  (:require [clojure.test :refer :all]
            [hangman-word.core :refer :all]))

(deftest a-regexp-from-clue-test
  (testing "if regexp-from-clue creates correct regular expression"
    (is (re-matches (regexp-from-clue "_e_l_g" #{ "j" "t" "a" } #{}) "jetlag"))
    (is (not (re-matches (regexp-from-clue "mo_" #{ "m" "n" } #{}) "mom")))))
