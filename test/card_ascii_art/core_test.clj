(ns card-ascii-art.core-test
  (:require [clojure.test :refer :all]
            [card-ascii-art.core :refer :all]))

(print-cards [1 2 10 13 "X"])

(print-card 3)

(print-card 13)

(print-player {:cards       [1 2 10 11 12 13]
               :player-name "Cesar Alcancio"
               :points      26})

(print-masked-player {:cards       [1 2 10 12 13]
                      :player-name "Cesar Alcancio"
                      :points      26})
