(ns stock.classSix)

(def order {:bag    {:amount 10 :price 80}
            :tshirt {:amount 3 :price 60}})

(defn print-and-fifteen
  [value]
  (println "value:" value (class value))
  15)

(println (map print-and-fifteen order))

(defn print-and-fifteen
  [[key value]]                                             ; destructuring value
  (println key "and" value)
  15)
(println (map print-and-fifteen order))


(defn print-and-fifteen
  [[key value]]
  value)
(println (map print-and-fifteen order))

(defn products-price [[key value]]
  (* (:amount value) (:price value)))
(println (map products-price order))
(println (reduce + (map products-price order)))

(defn products-price [[_ value]]                            ; Ignoring key with blank identifier.
  (* (:amount value) (:price value)))
(println (map products-price order))
(println (reduce + (map products-price order)))

(defn total-by-order
  [order]
  (reduce + (map products-price order)))
(println (total-by-order order))


; THREADING LAST
(defn total-by-order
  [order]
  (->> order
       (map products-price)
       (reduce +)))
(println (total-by-order order))



; A little bit more polite function
(defn products-total-price [product]                        ; Ignoring key with blank identifier.
  (* (:amount product) (:price product)))

(defn total-by-order
  [order]
  (->> order
       vals
       (map products-total-price)
       (reduce +)))
(println (total-by-order order))



; Filter
(def order {:bag        {:amount 10 :price 80}
            :t-shirt    {:amount 3 :price 60}
            :coffee-mug {:amount 1}})
(defn free?
  [[key value]]
  (<= (get value :price 0) 0))
(println (free? (first order)))                             ; Like a test rsr
(println "Filtering free products")
(println (filter free? order))


(defn free?
  [value]
  (<= (get value :price 0) 0))

(println (filter (fn [[key value]] (free? value)) order))   ; anonymous function
(println (filter #(free? (second %)) order))                ; lambda fn


(defn paid?
  [value]
  not (free? value))
(println "Using paid? predicate.")
(println (paid? {:price 50}))
(println (paid? {:price 0}))

; Functions Composition
(def paid? (comp not free?))                                ; Symbol paid
(println (paid? {:price 10}))
(println (paid? {:price 0}))


; Exercises
; -> Map Reduce
(def customers [{:name         "Pedro"
                 :certificates ["Clojure" "Java" "Machine Learning"]}
                {:name         "Joana"
                 :certificates ["Java" "Ciência da Computação"]}
                {:name         "Keith"
                 :certificates ["Arquitetura" "Gastronomia"]}])

(defn count-certificates
  [person]
  (count (:certificates person)))                           ; Prefix way

; OR using

(defn count-certificates
  [person]
  (-> person
      :certificates
      count))                                               ; Threading first

(println (->> customers
              (map count-certificates)
              (reduce +)))



; Better way doing directly...
(println (->> customers
              (map :certificates)
              (map count)
              (reduce +)))