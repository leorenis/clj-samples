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


; Using loop
(defn custom-count-loop
  [elements]
  ; (println "Bad practice...")                               ; This function use loop, only because we have some code before or after the loop... For this reason we've decided for loop instead a tail recur function.
   (loop [total 0
          rest-elements elements]
     (if (seq rest-elements)
       (recur (inc total) (next rest-elements))             ; recur call the function loop passing the arguments redefining them.
       total)))


(println (custom-count-loop ["John" "Doe"]))