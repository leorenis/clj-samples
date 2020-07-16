(ns ecommerce.classOne)

(defn custom-map
  [func sequence]
  (let [f (first sequence)]
    (if (not (nil? f))
      (do
        (func f)
        (custom-map func (rest sequence))))))

(custom-map println ["John" "Doe" "Peter"])