(ns stock.classThree)

; Predicate function. It ends with ? and return a boolean value.
(defn more-expensive-than-100?
  [raw-value]
  (> raw-value 100))

(defn ten-percent-discounted
  "Returns the value with discount of 10% when have to apply discount."
  [apply? raw-value]
  (if (apply? raw-value)
    (let [discount-rate (/ 10 100)                          ;; Multiples declarations in let...
          discount (* raw-value discount-rate)]
      (- raw-value discount))
    raw-value))

(println (ten-percent-discounted more-expensive-than-100? 1000))
(println "No discount" (ten-percent-discounted more-expensive-than-100? 100))


;; Variations
;; (defn more-expensive-than-100? [raw-value] (> raw-value 100))
(println (ten-percent-discounted (fn [raw-value] (> raw-value 100)) 2000)) ;; inline anonymous function
(println (ten-percent-discounted (fn [v] (> v 100)) 1100))  ;; abbreviation symbol name
(println (ten-percent-discounted #(> %1 100) 1500 ))        ;; %1 represents first argument as %2 would represent second...
(println (ten-percent-discounted #(> % 100) 1600 ))         ;; If we have only one argument, we can use just %.

; Midterm
(def more-expensive-than-100? (fn [raw-value] (> raw-value 100))) ; We are defining a symbol e assigning a anonymous function.
(def more-expensive-than-100? #(> % 100)) ; Or simply

; Calling
(println (ten-percent-discounted more-expensive-than-100? 3000))
