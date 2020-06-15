(ns stock.classFour)

(def prices [30 700 1000])                                  ; Define array with Three elements

(println (prices 0))                                        ; Print first element of array
(println (get prices 2))
(println (get prices 4))                                    ; In this case, get do not return IndexOfBoundException. Returns nil.
