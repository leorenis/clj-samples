(ns ecommerce.classTwo)

(defn custom-count
  [total elements]                                          ; two arity
  (if (seq elements)
    (recur (inc total) (next elements))
    total))

(println (custom-count 0 ["John" "Doe"]))

; Test functions variations

(defn my-func
  ([parameter-one] (println "Single parameter" parameter-one))
  ([parameter-one parameter-two] (println "Couple parameters" parameter-one parameter-two)))

(my-func 1)
(my-func 1 2)