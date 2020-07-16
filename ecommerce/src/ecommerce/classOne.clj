(ns ecommerce.classOne)

; TAIL RECURSION
(defn custom-map
  [func sequence]
  (let [f (first sequence)]
    (if (not (nil? f))
      (do
        (func f)
        (recur func (rest sequence))))))                    ; recur fn must be the last stub of function before return. recur convert recursion in loop.

(custom-map println ["John" "Doe" "Peter"])

(custom-map println (range 10000))