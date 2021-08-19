# clj-github-actions-example [![Clojars Project](https://img.shields.io/clojars/v/com.github.opqdonut/clj-github-actions-example.svg)](https://clojars.org/com.github.opqdonut/clj-github-actions-example)

An example of testing & deploying a Clojure library using Github Actions

See here:
- [.github/workflows/clojure.yml](.github/workflows/clojure.yml) runs tests for the master branch and each pull request against master
- [.github/workflows/release.yml](.github/workflows/release.yml) builds and deploys a release to clojars for each commit in the release branch

Future ideas:
- Build release tags instead of release
- Reuse the uberjar built by the test workflow in the deploy workflow
- Automate commiting and tagging a release

## License

Copyright © Joel Kaasinen

Distributed under the Eclipse Public License, the same as Clojure.
