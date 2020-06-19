(ns stock.classFive)

(def stock { :bag 10, :skirt 5, :chair 3})                            ; Using keyword as key
(println stock)
(println "We have" (count stock) "elements")
(println "Keys are:" (keys stock))
(println "Values: " (vals stock))

(println (assoc stock :sock 2))

(defn less-one
  "Take less one."
  [value]
  (println "Taking 1")
  (- value 1))

(println (update stock :bag less-one))
(println (update stock :skirt #(- % 1)))
(println (dissoc stock :sock))