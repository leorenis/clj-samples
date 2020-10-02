(ns stock.classFive)

(def stock {:bag 10, :skirt 5, :chair 3})                   ; Using keyword as key
(println stock)
(println "We have" (count stock) "elements")
(println "Keys are:" (keys stock))
(println "Values: " (vals stock))

(println (assoc stock :sock 2))

(defn less-one
  "Take less one..."
  [value]
  (println "Taking 1")
  (- value 1))

(println (update stock :bag less-one))
(println (update stock :skirt #(- % 1)))
(println (dissoc stock :sock))


(def order {:bag    {:amount 10 :price 80}
            :tshirt {:amount 3 :price 60}})

(println order)
(println (order :bag))                                      ; using map as function. If order is nil. Throws a NullPointerException here.
(println (get order :bag))                                  ; using get function... More safely
(println (get order :bag {}))                               ; get with default value
; PREFIX WAY
(println (:amount (:bag order)))
(println (:amount (:chair order {})))                       ; Trying to access the  order's keywords :chair, :amount, if does not exists, take empty object. Like {}

(println (update-in order [:bag :amount] inc))

;THREADING, CHAIN....
(println (->
           order
           :bag
           :amount))

(-> order :bag :amount println)


(def
  customers {:15 {:name "Julia" :certificates ["Clojure" "Java" "Machine Learning"]}})

(println (count (:certificates (:15 customers))))
(-> customers :15 :certificates count println)
