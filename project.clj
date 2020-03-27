(defproject district0x/bide "1.6.1"
  :description "Simple routing for ClojureScript"
  :url "https://github.com/funcool/bide"
  :license {:name "BSD (2-Clause)"
            :url "http://opensource.org/licenses/BSD-2-Clause"}
  :dependencies [[org.clojure/clojure "1.9.0" :scope "provided"]
                 [org.clojure/clojurescript "1.10.339" :scope "provided"]]

  :deploy-repositories {"releases" :clojars
                        "snapshots" :clojars}
  :source-paths ["src" "assets"]
  :test-paths ["test"]
  :jar-exclusions [#"\.swp|\.swo|user.clj"]

  :profiles
  {:dev {:dependencies [[bidi "2.1.4"]]}}

  :codeina {:sources ["src"]
            :reader :clojurescript
            :target "doc/dist/latest/api"
            :src-uri "http://github.com/funcool/bide/blob/master/"
            :src-uri-prefix "#L"}

  :plugins [[funcool/codeina "0.5.0"]
            [lein-ancient "0.6.15"]])
