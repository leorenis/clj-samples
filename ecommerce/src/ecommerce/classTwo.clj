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


; Refactoring our function to use multiple polymorphic way...

(defn custom-count
  ([elements]
   (custom-count 0 elements))
  ([total elements]                                         ; two arity
   (if (seq elements)
     (recur (inc total) (next elements))
     total)))

(println (custom-count 0 ["John" "Doe"]))                   ; passing two parameters
(println (custom-count []))                                 ;  passing only elements