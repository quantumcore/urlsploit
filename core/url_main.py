from flask import Flask, render_template, request 
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

def clear():
    if(os.name == "nt"): 
        os.system("cls")
    else:
        os.system("clear")

def AnimateIntro():
    
    banner = [
        
        "  ██╗   ██╗██████╗ ██╗         ███████╗██████╗ ██╗      ██████╗ ██╗████████╗\n"
        "  ██║   ██║██╔══██╗██║         ██╔════╝██╔══██╗██║     ██╔═══██╗██║╚══██╔══╝\n"
        "  ██║   ██║██████╔╝██║         ███████╗██████╔╝██║     ██║   ██║██║   ██║   \n"
        "  ██║   ██║██╔══██╗██║         ╚════██║██╔═══╝ ██║     ██║   ██║██║   ██║   \n"
        "  ╚██████╔╝██║  ██║███████╗    ███████║██║     ███████╗╚██████╔╝██║   ██║   \n"
        "   ╚═════╝ ╚═╝  ╚═╝╚══════╝    ╚══════╝╚═╝     ╚══════╝ ╚═════╝ ╚═╝   ╚═╝   \n"
        "                              Version 1                                     \n"                               
    
    ]
    clear()
    for b in banner:          
        for c in b:          
            print(Style.BRIGHT + Fore.LIGHTGREEN_EX + c + Style.RESET_ALL, end='')    
            sys.stdout.flush()  
            time.sleep(0.001)          
    print('')  
