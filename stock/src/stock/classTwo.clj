(ns stock.classTwo)

(defn print-message []
  (println "### SystemX ###")
  (println "Welcome to Stock."))


(print-message)

(defn ten-percent-discounted
  "Returns the value with discount of 10% when raw value greater than 100."
  [raw-value]
  (if (> raw-value 100)
    (let [discount-rate (/ 10 100)                        ;; Multiples declarations in let...
          discount      (* raw-value discount-rate)]
      (println "Calc discount of " discount)
      (- raw-value discount))
    raw-value))

(ten-percent-discounted 1000)
(println "No discount" (ten-percent-discounted 100))