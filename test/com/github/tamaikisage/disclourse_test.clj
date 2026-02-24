(ns com.github.tamaikisage.disclourse-test
  (:require [clojure.test :refer [deftest is]]
            [com.github.tamaikisage.disclourse :as main]
            [xtdb.api :as xt]))

(deftest example-test
  (is (= 4 (+ 2 2))))

(defn get-context [node]
  {:biff.xtdb/node  node
   :biff/db         (xt/db node)
   :biff/malli-opts #'main/malli-opts})

