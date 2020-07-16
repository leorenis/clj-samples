(ns ecommerce.core)

(map println ["John" "Doe" "Peter"])
(println (first ["John" "Doe", "Peter"]))
(println (rest ["John" "Doe", "Peter"]))
(println (rest []))
(println (next ["John" "Doe", "Peter"]))
(println (next []))
(println (seq [1 2 3 4]))     ; Create a seq with elements
(println (seq []))            ; When empty, returns nil


(defn custom-map
  [func sequence]
  (let [f (first sequence)]
    (func f)
    (if (nil? f)
      (do
        (func f)
        (custom-map func (rest sequence))))))

(custom-map println ["John" "Doe" "Peter"])

;(custom-map println (range 100000))