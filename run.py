from flask import Flask, render_template

app = Flask(__name__)
app.template_folder = "templates"
@app.route("/")
def run():
	return render_template("sample.html")


if __name__ == '__main__':
	app.run()
