(ns sort.clj)
(defn coll-sort 
  "sort all elements in a ascending order"
  [arg is-sort]
  (if (true? is-sort)
    (sort arg)
    (reverse (sort arg))))

(println (coll-sort [5 1 2 12 6] true))
(println (coll-sort [5 1 2 12 6] false))
