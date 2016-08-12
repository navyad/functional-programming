(ns replicate_elements.clj)

(defn repl
  "replicate all elements n times"
  [ele ntimes]
  (repeat ntimes ele))


(defn repl-all
  "replicate all elements n times"
  [coll n]
  (for [ele coll]
    (repl ele n)))


(println (repl-all ["clojure" "java" "python"] 5))
