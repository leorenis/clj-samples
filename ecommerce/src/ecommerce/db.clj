(ns ecommerce.db)

(def order {:user 15
             :items {:bag {:id :bag :amount 2 :unit-price 80}
                     :shirt {:id :shirt :amount 3 :unit-price 40}
                     :shoes {:id :shoes :amount 1 :unit-price 60}}})

(def order1 {:user 10
             :items {:bag {:id :bag :amount 5 :unit-price 80}
                     :shirt {:id :shirt :amount 3 :unit-price 40}
                     :shoes {:id :shoes :amount 4 :unit-price 60}}})

(def order2 {:user 5
              :items {:bag {:id :bag :amount 2 :unit-price 78}
                      :shirt {:id :shirt :amount 9 :unit-price 60}
                      :shoes {:id :shoes :amount 10 :unit-price 75}}})

(def order3 {:user 2
              :items {:bag {:id :bag :amount 10 :unit-price 55}
                      :shirt {:id :shirt :amount 7 :unit-price 60}
                      :shoes {:id :shoes :amount 16 :unit-price 63}}})

(def order4 {:user 20
              :items {:bag {:id :bag :amount 6 :unit-price 40}
                      :shirt {:id :shirt :amount 8 :unit-price 85}
                      :shoes {:id :shoes :amount 3 :unit-price 58}}})

(def order5 {:user 25
              :items {:bag {:id :bag :amount 7 :unit-price 60}
                      :shirt {:id :shirt :amount 16 :unit-price 60}
                      :shoes {:id :shoes :amount 3 :unit-price 69}}})

(def order6 {:user 30
              :items {:bag {:id :bag :amount 15 :unit-price 90}
                      :shirt {:id :shirt :amount 12 :unit-price 100}
                      :shoes {:id :shoes :amount 8 :unit-price 84}}})


(defn orders []
  [order order1 order2 order3 order4 order5 order6])
