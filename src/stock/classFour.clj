(ns stock.classFour)

(def prices [30 700 1000])                                  ; Define array with Three elements

(println (prices 0))                                        ; Print first element of array, using vector as function.
(println (get prices 2))
(println (get prices 4))                                    ; In this case, get do not return IndexOfBoundException. Returns nil.
(println (get prices 4 0))                                  ; Defines default value, if index 4 doesn't exists, return 0 instead nil.
(println (get prices 2 0))                                  ; When exists, returns the value in position.
; TO avoid exceptions, use get function.

(println (conj prices 10))                                  ; Return new array with element on the end.

(println (+ 5 1))
(println (inc 5))                                           ; inc function return the value + 1. Increase.
(println (update prices 0 inc))
(println (update prices 1 dec))


(def apply? #(> % 100))

(defn ten-percent-discounted
  "Returns the value with discount of 10% when have to apply discount."
  [raw-value]
  (if (apply? raw-value)
    (let [discount-rate (/ 10 100)                          ;; Multiples declarations in let...
          discount (* raw-value discount-rate)]
      (- raw-value discount))
    raw-value))


(println "map" (map ten-percent-discounted prices))
(println (range 10))
(println (filter even? (range 10)))

(println "Filter when greater 100" (filter apply? prices))
(println "Discount applied after filter greater than 100 values" (map ten-percent-discounted (filter apply? prices)))

(println prices)
(println (reduce + prices))

(defn my-sum
  "Sum two values"
  [value, other-value]
  (println "+" value other-value)
  (+ value other-value))

(println (reduce my-sum (range 10)))