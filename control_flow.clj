(if true
  (println "I always speak truth")
  (println "I rarely speak lie"))

(if false
  (println "I always speak truth")
  (println "I rarely speak lie"))

(if nil
  (println "I always speak truth")
  (println "I rarely speak lie"))

(if false
  (println "I rarely speak lie"))


;; do multiple things in if else construct
(if true
  (do (println "task one")
      (println "task two"))
  (do (println "Failure!")
      (println "missed bull eye")))


;; do multiple things in while construct
(when true
    (println "TASK ONE")
    (println "TASK TWO"))
