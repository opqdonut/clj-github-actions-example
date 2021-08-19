# clj-github-actions-example [![Clojars Project](https://img.shields.io/clojars/v/com.github.opqdonut/clj-github-actions-example.svg)](https://clojars.org/com.github.opqdonut/clj-github-actions-example)

An example of testing & releasing a Clojure library using Github Actions

See here:
- [.github/workflows/clojure.yml](.github/workflows/clojure.yml) runs tests for the master branch and each pull request against master
  - [Example PR that passes tests](https://github.com/opqdonut/clj-github-actions-example/pull/1)
  - [Example PR that fails tests](https://github.com/opqdonut/clj-github-actions-example/pull/2)
- [.github/workflows/release.yml](.github/workflows/release.yml) builds and deploys a release to [Clojars](https://clojars.org/com.github.opqdonut/clj-github-actions-example) when
  - The [release branch](https://github.com/opqdonut/clj-github-actions-example/tree/release) gets a push
  - A release gets published on Github
    - [Example Github release](https://github.com/opqdonut/clj-github-actions-example/releases/tag/release%2F0.1.1)

Future ideas:
- Reuse the uberjar built by the test workflow in the deploy workflow
- Automate commiting and tagging a release

## License

Copyright © Joel Kaasinen

Distributed under the Eclipse Public License, the same as Clojure.
