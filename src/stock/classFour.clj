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