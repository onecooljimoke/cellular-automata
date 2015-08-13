(ns cellular-automata.lib.rules
  "Rules for Cellular Automata based on Stephen Wolfram's labelling system"
  (:gen-class))

;;TODO: what's the best data structure for representing this?
;for now I'm storing the rule in reverse of how it normally appears so that the index corresponds to the correct rule
(def rule-3 [1 1 0 0 0 0 0 0])
