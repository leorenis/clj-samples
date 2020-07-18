(ns ecommerce.classTwo)

(defn custom-count
  [total elements]                                          ; two arity
  (if (seq elements)
    (recur (inc total) (next elements))
    total))

(println (custom-count 0 ["John" "Doe"]))