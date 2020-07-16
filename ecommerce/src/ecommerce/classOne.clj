(ns ecommerce.classOne)

(defn custom-map
  [func sequence]
  (let [f (first sequence)]
    (if (not (nil? f))
      (do
        (func f)
        (recur func (rest sequence))))))                    ; recur fn must be the last stub of function. recur convert recursion in loop.

(custom-map println ["John" "Doe" "Peter"])

(custom-map println (range 100000))