(ns card-ascii-art.core)

(defn break-line [n count-cards]
  (when (= (inc n) count-cards) (println "")))

(defn number-part [n cards]
  (case (get cards n)
    "X" (print "│XXXXXXX│")
    1 (print "│A      │")
    10 (print "│10     │")
    11 (print "│J      │")
    12 (print "│Q      │")
    13 (print "│K      │")
    (print (format "│%s      │" (get cards n)))))

(defn x-part [n cards]
  (case (get cards n)
    "X" (print "│XXXXXXX│")
    (print "│       │")))

(defn show-cards [player]
  (let [player-name (:player-name player)
        cards (:cards player)
        count-cards (count cards)]
    (println player-name)
    (dotimes [n count-cards]
      (print "┌───────┐")
      (break-line n count-cards))
    (dotimes [n count-cards]
      (number-part n cards)
      (break-line n count-cards))
    (dotimes [n count-cards]
      (x-part n cards)
      (break-line n count-cards))
    (dotimes [n count-cards]
      (x-part n cards)
      (break-line n count-cards))
    (dotimes [n count-cards]
      (print "└───────┘")
      (break-line n count-cards)))
  (println "Total " (:points player))
  (println "--------------"))

(defn art-print [player]
  (show-cards player))
