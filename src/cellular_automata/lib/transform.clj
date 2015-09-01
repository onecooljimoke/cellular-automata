(ns cellular-automata.lib.transform
  "functions for transforming a generation")


;;notes on subvec: start index is inclusive, stop index is exclusive
;;is ok to go one past the last element of a vector, but any farther will throw error
(defn grab-neighbors
  "Takes the first 3 elements of a vector. In terms of cellular automata, this will take an element and it's left and right neighbors"
  [vec]
  (subvec vec 0 3))

(defn group-neighbors
  "Recursively take the first 3 elements of a vector and add the resulting sub-vector to a new vector.  This gets the neighbor groups for each of the interior elements of the vector"
  [vec]
  ;;use let to declare a new containing vector so the user doesn't have to pass in one
  ;;loop until the 'old' vector has length < 3
  (loop [oldvec vec
         newvec '[]]
    (if (< (count oldvec) 3) 
      newvec
      (recur (into [] (rest oldvec)) (conj newvec (grab-neighbors oldvec))))))

(defn sum-neighbors
  "Take a vector of vectors and return a vector where the i-th number represents the sum of the elements of the i-th sub-vector"
  [neighbor-vec]
  (map #(apply + %) neighbor-vec))
