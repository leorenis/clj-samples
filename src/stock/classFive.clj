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


(def order {:bag { :amount 10 :price 80}
            :tshirt {:amount 3 :price 60}})

(println order)
(println (order :bag))                                      ; using map as function
(println (get order :bag))                                  ; using get function... More safely
(println (get order :bag {}))                               ; get with default value
(println (:amount (:bag order)))
(println (:amount (:chair order {})))                       ; Trying to access the  order's keywords :chair, :amount, if does not exists, take empty object. Like {}