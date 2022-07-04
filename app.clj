(defn sum [x, y] 
    (+ x y))

(defn rest [x, y]
    (- x y))

(defn isNumber [x] 
    (number? x))


(defn multiply [x, y]
    (def isXNumber (isNumber x))
    (def isYNumber (isNumber y))
    (if (and isXNumber  isYNumber) (* x y) ))


(print (multiply 5 12))