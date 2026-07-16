---
description: Produce a structured onboarding brief for this project
---

Generate an onboarding brief for a developer who is new to this repository.

Gather context first, in this order:

1. **Directory structure** — Map the top-level layout and the main source directories. Note the language(s) and framework(s) in use.
2. **Build / dependency file** — Read `package.json` if present, otherwise the equivalent for this project (`pom.xml`, `build.gradle`, `pyproject.toml`, `Cargo.toml`, `go.mod`, etc.). Extract the key dependencies, scripts/tasks, and how the project is built and run.
3. **CLAUDE.md** — If a `CLAUDE.md` (or `.claude/CLAUDE.md`) exists, read it and fold its guidance into the relevant sections below.

Then produce a structured brief with these sections:

1. **Entry points** — Where execution starts (main class/function, server bootstrap, CLI entry) and the primary routes/controllers/handlers, with `file:line` references.
2. **Architecture summary** — The high-level shape: layers, key modules, how requests/data flow through the system. Keep it to the essentials a newcomer needs.
3. **Auth approach** — How authentication/authorization is handled. If there is none, say so explicitly.
4. **Test instructions** — How to run the test suite and where tests live. Include the exact command(s).
5. **Sensitive / off-limits areas** — Anything flagged as sensitive, security-critical, generated, or not-to-be-edited (from CLAUDE.md, comments, config, or conventions). If nothing is flagged, say so.

Keep each section concise. Use `file:line` references so findings are clickable. If a section genuinely does not apply to this project, state that rather than inventing content.
