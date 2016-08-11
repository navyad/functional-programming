(ns palindrome.clj)

(defn rear-index
  [len index]
  (- len (+ 1 index)))


(defn element-compare 
  "compare element of a data"
  [index data]
  (= (get data index) (get data (rear-index (count data) index)) ))

(defn check-palindrome
  [arg]
  (for [index (range 0 (count arg))]
    (element-compare index arg))
)


(defn is-palindrome
  "retuns boolean if arg is palindrome or not"
  [arg]
  (every? true? arg))

(println (is-palindrome (check-palindrome [11 22 33 22 11])))
(println (is-palindrome (check-palindrome [11 22 33 44 11])))
