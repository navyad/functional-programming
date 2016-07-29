(ns find_kth_element)
(defn find-kth
  "returns element at kth postiton for container"
  [container, position]
  (try
    (nth container position)
  (catch Exception exp (str "exception:" (.getMessage exp)))))

  
(println (find-kth (vector 100 99 98) 2))
(println (find-kth (list "nav" "yad" "navyad") 2))
(println (find-kth (list "nav" "yad" "navyad") 10))
