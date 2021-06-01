(ns card-ascii-art.core)

(defn- random-symbol []
  (get ["♠" "♦" "♥" "♣"] (rand-int 4)))

(defn- break-line []
  (println ""))

(defn- top []
  (print "┌───────┐"))

(defn- bottom []
  (print "└───────┘"))

(defn- number-part-top [card]
  (case card
    "X" (print "│░░░░░░░│")
    1 (print "│A      │")
    10 (print "│10     │")
    11 (print "│J      │")
    12 (print "│Q      │")
    13 (print "│K      │")
    (print (format "│%s      │" card))))

(defn- number-part-bottom [card]
  (case card
    "X" (print "│░░░░░░░│")
    1 (print "│      A│")
    10 (print "│     10│")
    11 (print "│      J│")
    12 (print "│      Q│")
    13 (print "│      K│")
    (print (format "│      %s│" card))))

(defn- symbol-part [card]
  (case card
    "X" (print "│░░░░░░░│")
    (print (format "│   %s   │" (random-symbol)))))

(defn print-cards [cards]
  (let [quantity-cards (count cards)]
    (dotimes [n quantity-cards]
      (top))
    (break-line)
    (dotimes [n quantity-cards]
      (number-part-top (get cards n)))
    (break-line)
    (dotimes [n quantity-cards]
      (symbol-part (get cards n)))
    (break-line)
    (dotimes [n quantity-cards]
      (number-part-bottom (get cards n)))
    (break-line)
    (dotimes [n quantity-cards]
      (bottom))
    (break-line)))

(defn print-card [card]
  (print-cards [card]))

(defn print-player [player]
  (let [player-name (:player-name player)
        cards (:cards player)]
    (println player-name)
    (print-cards cards))
  (println (:points player) "points")
  (println "--------------"))
