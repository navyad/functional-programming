(ns palindrome.clj)

(defn rear-index
  [len index]
  (- len (+ 1 index)))


(defn element-compare 
  [index data]
  (= (get data index) (get data (rear-index (count data) index)) ))

(defn check-palindrome
  [arg]
  (for [index (range 0 (count arg))]
    (element-compare index arg))
)

(println (check-palindrome [11 22 33 22 11]))
