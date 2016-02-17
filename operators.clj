;; Arthimetic operators
(println (= 1 1))
(println (- 10 3 2)) ;; 5 = (10-3+2)
(println (+ 1 2 3)) ;; 6
(println (inc 3)) ;; 4
(println (dec 3)) ;; 2
(println (min 1 2 3 4 5)) ;; 1
(println (max 1 2 3 4 5)) ;; 5

;;Both nil and false are used to represent logical falsiness
(println (nil? nil))
(println (false? false))
(println (false? true))
(println (false? (= 1 2)))
(println (number? 1.0)) ;; true

;; "or" returns either the first truthy value or the last value.
(println (or (= 0 1) (= "yes" "no"))) ;; false
(println (or (= 1 1) (= "yes" "no"))) ;; true
(println (or (= 0 1) nil)) ;; nil
(println (or :clojure :python)) ;; clojure

;;and returns the first falsey value or, if no values are falsey, the last truthy value
(println (and (= 0 1) (= "yes" "no"))) ;; false
(println (and (= 1 1) (= "yes" "no"))) ;; false
(println (and (= 0 1) nil)) ;; false
(println (and :clojure :python)) ;; python

