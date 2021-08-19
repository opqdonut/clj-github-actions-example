(defproject com.github.opqdonut/clj-github-actions-example "0.1.0"
  :description "An example of testing & deploying a Clojure library using Github Actions. See Github repo."
  :url "http://github.com/opqdonut/clj-github-actions-example"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :repl-options {:init-ns clj-github-actions-example.core}
  :deploy-repositories [["clojars" {:url "https://repo.clojars.org/"
                                    :sign-releases false
                                    :username :env/CLOJARS_USER
                                    :password :env/CLOJARS_DEPLOY_TOKEN}]])
