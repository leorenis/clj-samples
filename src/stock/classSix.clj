(ns stock.classSix)

(def order {:bag    {:amount 10 :price 80}
            :tshirt {:amount 3 :price 60}})

(defn print-and-fifteen
  [value]
  (println "value:" value (class value))
  15)

(println (map print-and-fifteen order))

(defn print-and-fifteen
  [[key value]]                                             ; destructuring value
  (println key "and" value)
  15)
(println (map print-and-fifteen order))


(defn print-and-fifteen
  [[key value]]
  value)
(println (map print-and-fifteen order))

(defn products-price [[key value]]
  (* (:amount value) (:price value)))
(println (map products-price order))
(println (reduce + (map products-price order)))

(defn products-price [[_ value]]                            ; Ignoring key with blank identifier.
  (* (:amount value) (:price value)))
(println (map products-price order))
(println (reduce + (map products-price order)))
