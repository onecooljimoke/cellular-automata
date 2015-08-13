(ns cellular-automata.core
  "First stab at simple 2d cellular automata a la Wolfram"
  (:require [cellular-automata.lib.rules :as rules])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "rule 3 (in reverse): " rules/rule-3))
