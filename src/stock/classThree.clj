(ns stock.classThree)

(defn has-discount?
  [raw-value]
  (> raw-value 100))

(defn ten-percent-discounted
  "Returns the value with discount of 10% when raw value greater than 100."
  [raw-value]
  (if (has-discount? raw-value)
    (let [discount-rate (/ 10 100)                          ;; Multiples declarations in let...
          discount (* raw-value discount-rate)]
      (- raw-value discount))
    raw-value))

(println (ten-percent-discounted 1000))
(println "No discount" (ten-percent-discounted 100))
