(ns clj-github-actions-example.core-test
  (:require [clojure.test :refer :all]
            [clj-github-actions-example.core :refer [answer]]))

(deftest test-answer
  (testing "I know the answer"
    (is (= 42 answer))))
