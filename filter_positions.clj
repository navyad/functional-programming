;; Return sum of odd elements from an list
;;

(defn odd_sum
  [ele_list]
  (doseq [[index ele] (map-indexed vector ele_list)]
    (index ele)))
