---
description: Review pending changes for JSDoc, console.log, and test coverage
---

Review the code changes on the current branch (compare against the `main` branch using `git diff main...HEAD`, plus any uncommitted changes).

Perform the following checks:

1. **Missing JSDoc** — Find any functions in the changed code that lack a JSDoc doc comment. Report the file, function name, and line number for each.
2. **console.log statements** — Find any `console.log` (and other `console.*` debug) statements left in the changed code. Report the file and line number for each.
3. **Missing tests** — For each newly added function, check whether a corresponding test exists. Report any new function that has no test covering it.
4. **Summary** — Present all findings as a single numbered list, grouped by the three checks above. If a check has no issues, state that explicitly. End with a short overall verdict (ready to merge / needs changes).

Keep the output concise and reference `file:line` so results are clickable.
