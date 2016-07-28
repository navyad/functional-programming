(ns problem_1.clj)
(defn first-ele
  "Returns first element of vector or list"
  [arg]
  (if (or (vector? arg) (list? arg))
    (first arg)))

(defn last-ele
  "Returns last element of vector or list"
  [arg]
  (if (or (vector? arg) (list? arg))
    (last arg)))


(println (first-ele [1, 2, 3]))
(println (last-ele [11, 22, 33]))

