(ns stock.classFive)

(def stock { :bag 10, :skirt 5})                            ; Using keyword as key
(println stock)
(println "We have" (count stock) "elements")
(println "Keys are:" (keys stock))
(println "Values: " (vals stock))