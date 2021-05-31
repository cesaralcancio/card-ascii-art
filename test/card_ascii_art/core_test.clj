(ns card-ascii-art.core-test
  (:require [clojure.test :refer :all]
            [card-ascii-art.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (art-print {:cards       [1 2 10 11 12 13 "X"]
                :player-name "Cesar"
                :points      21})
    (is (= 1 1))))
