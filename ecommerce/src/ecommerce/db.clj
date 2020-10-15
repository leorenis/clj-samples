(ns ecommerce.db)

(def order {:user 10
             :items {:bag {:id :bag :amount 5 :unit-price 82}
                     :shirt {:id :shirt :amount 4 :unit-price 40}
                     :shoes {:id :shoes :amount 6 :unit-price 56}}})

(def order1 {:user 12
             :items {:bag {:id :bag :amount 5 :unit-price 22}
                     :shirt {:id :shirt :amount 7 :unit-price 40}
                     :shoes {:id :shoes :amount 11 :unit-price 70}}})

(def order2 {:user 5
              :items {:bag {:id :bag :amount 2 :unit-price 60}
                      :shirt {:id :shirt :amount 9 :unit-price 60}
                      :shoes {:id :shoes :amount 10 :unit-price 75}}})

(def order3 {:user 3
              :items {:bag {:id :bag :amount 10 :unit-price 55}
                      :shirt {:id :shirt :amount 2 :unit-price 60}
                      :shoes {:id :shoes :amount 15 :unit-price 63}}})

(def order4 {:user 20
              :items {:bag {:id :bag :amount 6 :unit-price 39}
                      :shirt {:id :shirt :amount 10 :unit-price 85}
                      :shoes {:id :shoes :amount 5 :unit-price 58}}})

(def order5 {:user 25
              :items {:bag {:id :bag :amount 7 :unit-price 60}
                      :shirt {:id :shirt :amount 29 :unit-price 60.9}
                      :shoes {:id :shoes :amount 20 :unit-price 69}}})

(def order6 {:user 31
              :items {:bag {:id :bag :amount 15 :unit-price 76}
                      :shirt {:id :shirt :amount 12 :unit-price 100}
                      :shoes {:id :shoes :amount 8 :unit-price 85}}})


(defn orders []
  [order order1 order2 order3 order4 order5 order6])
