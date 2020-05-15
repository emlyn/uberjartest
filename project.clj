(defproject uberjartest "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.10.1"]]

  :main uberjartest.core

  :profiles
  {:foo
   {:dependencies []}

   :dev
   [:foo]

   :uberjar
   [:foo
    {:aot :all}]})
