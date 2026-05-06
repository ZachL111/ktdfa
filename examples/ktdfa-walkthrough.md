# Ktdfa Walkthrough

This note is the quickest way to read the extra review model in `ktdfa`.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | input width | 144 | ship |
| stress | search depth | 199 | ship |
| edge | boundary pressure | 148 | ship |
| recovery | complexity | 162 | ship |
| stale | input width | 198 | ship |

Start with `stress` and `baseline`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The next useful expansion would be a malformed fixture around search depth and complexity.
