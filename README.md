<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Easy-to-Learn Java Projects — README</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=DM+Sans:wght@400;500;600;700&family=Space+Grotesk:wght@400;500;600;700&display=swap" rel="stylesheet">
<style>
:root{--paper:#f5f2e9;--ink:#242b25;--muted:#63695e;--green:#365f40;--lime:#d8f071;--line:#d9dcd0}
*{box-sizing:border-box}
body{margin:0;background:var(--paper);color:var(--ink);font-family:"DM Sans",sans-serif}
header{max-width:1120px;margin:auto;padding:26px 28px;border-bottom:1px solid var(--line);display:flex;justify-content:space-between;align-items:center;gap:20px}
.brand{font-family:"Space Grotesk",sans-serif;font-weight:700;letter-spacing:-.6px}
.brand span{color:var(--green)}
.meta{font-size:12px;color:var(--muted)}
main{max-width:1120px;margin:auto;padding:70px 28px}
.intro{display:grid;grid-template-columns:1fr auto;align-items:end;gap:24px;margin-bottom:36px}
.eyebrow{font-size:11px;letter-spacing:2px;font-weight:700;text-transform:uppercase;color:var(--green)}
h1,h2,h3{font-family:"Space Grotesk",sans-serif}
h1{font-size:clamp(34px,5vw,58px);line-height:1.07;letter-spacing:-2px;margin:16px 0}
.intro p{color:var(--muted);line-height:1.6;margin:0}
button{font:600 14px "DM Sans",sans-serif;padding:15px 22px;border:1px solid var(--ink);border-radius:5px;background:var(--ink);color:var(--paper);cursor:pointer;transition:transform .2s,background .2s}
button:hover{background:var(--green);transform:translateY(-2px)}
button:active{transform:translateY(0)}
button:focus-visible,summary:focus-visible{outline:3px solid var(--green);outline-offset:4px}
.document{background:#fffef9;border:1px solid var(--line)}
.docbar{display:flex;justify-content:space-between;padding:17px 26px;border-bottom:1px solid var(--line);font-size:12px;color:var(--muted)}
.docbar strong{color:var(--ink)}
article{padding:clamp(26px,5vw,58px)}
.badges{display:flex;gap:8px;flex-wrap:wrap}
.badges span{padding:6px 10px;font-size:11px;font-weight:700;background:#ecefe5;border-radius:3px}
.badges span:first-child{background:var(--lime)}
h2{font-size:clamp(30px,4vw,46px);letter-spacing:-1.5px;line-height:1.15;margin:24px 0 16px}
.lead{font-size:18px;line-height:1.7;max-width:680px;color:var(--muted)}
.note{border-left:3px solid var(--green);background:#f1f4ea;padding:16px 20px;margin:28px 0;font-size:14px;line-height:1.7}
.sections{display:grid;grid-template-columns:1fr 1fr;gap:40px;border-top:1px solid var(--line);padding-top:12px;margin-top:36px}
h3{font-size:21px;letter-spacing:-.5px}
ul,ol{padding-left:21px;color:var(--muted);line-height:1.9;font-size:15px}
code,pre{font-family:"Space Grotesk",monospace}
code{background:#eef0e8;padding:2px 5px;border-radius:3px;font-size:13px}
pre{background:var(--ink);color:var(--lime);padding:20px;overflow:auto;line-height:1.8;font-size:14px;border-radius:4px}
pre code{background:none;color:inherit;padding:0}
.closing{border-top:1px solid var(--line);padding-top:24px;margin-top:32px;color:var(--green);font-weight:600}
details{margin-top:24px}
summary{cursor:pointer;font-size:14px;color:var(--green);font-weight:600}
details pre{white-space:pre-wrap;color:var(--paper)}
footer{display:flex;justify-content:space-between;gap:20px;margin-top:28px;font-size:12px;color:var(--muted)}
#status{min-height:20px;font-size:13px;color:var(--green);margin-top:12px}
.intro,.document{animation:rise .6s both}.document{animation-delay:.12s}
@keyframes rise{from{opacity:0;transform:translateY(14px)}to{opacity:1;transform:translateY(0)}}
@media(max-width:650px){header{padding:20px}.meta{display:none}main{padding:40px 20px}.intro,.sections{grid-template-columns:1fr}.intro button{justify-self:start}.sections{gap:8px}footer{flex-direction:column}h1{letter-spacing:-1.3px}}
@media(prefers-reduced-motion:reduce){*{animation:none!important;transition:none!important}}
</style>
</head>
<body>
<header>
<div class="brand"><span>{ }</span> Java, one project at a time.</div>
<div class="meta">Umrat / Easy-To-Learn-Java-Projects</div>
</header>
<main>
<section class="intro">
<div>
<div class="eyebrow">A fresh look for your repository</div>
<h1>Small projects.<br>Big first steps.</h1>
<p>Your README, polished and ready to paste into GitHub.</p>
</div>
<button id="copy" type="button">Copy README Markdown ↗</button>
</section>
<div class="document">
<div class="docbar"><strong>README.md</strong><span>Preview</span></div>
<article>
<div class="badges"><span>JAVA</span><span>BEGINNER FRIENDLY</span><span>LEARN BY DOING</span></div>
<h2>☕ Easy-to-Learn Java Projects</h2>
<p class="lead">Learn Java one small project at a time. A collection of simple programs to help you practice the basics, experiment with ideas, and build confidence—at your own pace.</p>
<aside class="note"><strong>🌱 A work in progress</strong><br>Some solutions may contain mistakes or produce incorrect answers. Treat them as starting points: test the code, explore what happens, and see what you can improve!</aside>
<div class="sections">
<section>
<h3>🧩 Explore the projects</h3>
<ul>
<li><strong>Classic challenges:</strong> FizzBuzz and number exercises</li>
<li><strong>Games & quizzes:</strong> Nim, riddles, and multiple-choice questions</li>
<li><strong>Creative practice:</strong> ASCII art and playful programs</li>
<li><strong>Everyday ideas:</strong> age calculations and a pet food planner</li>
</ul>
</section>
<section>
<h3>🚀 Get started</h3>
<ol>
<li>Install a Java Development Kit (JDK).</li>
<li>Download or clone this repository.</li>
<li>Choose a <code>.java</code> file and read the code.</li>
<li>Compile it, run it, and try changing something!</li>
</ol>
</section>
</div>
<h3>⌨️ Run a project</h3>
<pre><code>javac FizBz.java
java FizBz</code></pre>
<p style="color:var(--muted);font-size:14px;line-height:1.7">Run these commands from the folder containing the file. The example assumes its class is named <code>FizBz</code> and has a <code>main</code> method; adjust the names for your chosen project.</p>
<h3>🤝 Make it better</h3>
<p style="color:var(--muted);line-height:1.7">Found a bug or a clearer solution? Open an issue or submit a pull request. Corrections, explanations, and beginner-friendly improvements are welcome.</p>
<p class="closing">Stay curious. Make mistakes. Keep coding. ☕</p>
</article>
</div>
<div id="status" role="status" aria-live="polite"></div>
<details>
<summary>View the Markdown source</summary>
<pre id="source"></pre>
</details>
<footer><span>Made for learning, not perfection.</span><span>Copy → paste into README.md → preview → commit</span></footer>
</main>
<script>
const markdown = `# ☕ Easy-to-Learn Java Projects

**Java · Beginner friendly · Learn by doing**

Learn Java one small project at a time. A collection of simple programs to help you practice the basics, experiment with ideas, and build confidence—at your own pace.

> 🌱 **A work in progress**
>
> Some solutions may contain mistakes or produce incorrect answers. Treat them as starting points: test the code, explore what happens, and see what you can improve!

## 🧩 Explore the projects

- **Classic challenges:** FizzBuzz and number exercises
- **Games & quizzes:** Nim, riddles, and multiple-choice questions
- **Creative practice:** ASCII art and playful programs
- **Everyday ideas:** age calculations and a pet food planner

## 🚀 Get started

1. Install a Java Development Kit (JDK).
2. Download or clone this repository.
3. Choose a \`.java\` file and read the code.
4. Compile it, run it, and try changing something!

## ⌨️ Run a project

\`\`\`bash
javac FizBz.java
java FizBz
\`\`\`

Run these commands from the folder containing the file. The example assumes its class is named \`FizBz\` and has a \`main\` method; adjust the names for your chosen project.

## 🤝 Make it better

Found a bug or a clearer solution? Open an issue or submit a pull request. Corrections, explanations, and beginner-friendly improvements are welcome.

---

**Stay curious. Make mistakes. Keep coding. ☕**
`;
document.getElementById('source').textContent = markdown;
document.getElementById('copy').addEventListener('click', async function(){
try {
await navigator.clipboard.writeText(markdown);
this.textContent = 'Copied! ✓';
document.getElementById('status').textContent = 'Paste this into your GitHub README.md editor, then preview and commit.';
setTimeout(()=>this.textContent='Copy README Markdown ↗',2500);
} catch {
document.querySelector('details').open = true;
const range = document.createRange();
range.selectNodeContents(document.getElementById('source'));
const selection = window.getSelection();
selection.removeAllRanges();
selection.addRange(range);
document.getElementById('status').textContent = 'Markdown selected below. Press Ctrl+C (or Command+C) to copy.';
}
});
</script>
</body>
</html>
